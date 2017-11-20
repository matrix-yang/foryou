package com.yang.excel;

import org.apache.poi.POIXMLDocument;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xwpf.usermodel.*;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class WordUtil {
    //, Map<String, Object> params
    public static void replaceInTable(String templatePath,String destFilePath, Map<String, String> map) throws IOException {
        FileOutputStream out = null;
        XWPFDocument doc = null;
        doc = new XWPFDocument(POIXMLDocument.openPackage(templatePath));
        Iterator<XWPFTable> iterator = doc.getTablesIterator();
        XWPFTable table;
        List<XWPFTableRow> rows;
        List<XWPFTableCell> cells;
        List<XWPFParagraph> paras;
        while (iterator.hasNext()) {
            table = iterator.next();
            rows = table.getRows();
            for (XWPFTableRow row : rows) {
                cells = row.getTableCells();
                for (XWPFTableCell cell : cells) {
                    paras = cell.getParagraphs();
                    for (XWPFParagraph text:paras) {
                        for (XWPFRun run : text.getRuns()){
                            String key=run.getText(0);
                            if (map.containsKey(key)){
                                run.setText(map.get(key),0);
                            }
                        }
                    }
                }
            }
        }

        File destFile = new File(destFilePath);
        if (!destFile.getParentFile().exists()) {
            destFile.getParentFile().mkdirs();
        }
        out = new FileOutputStream(destFilePath);
        doc.write(out);

        try {
            if (out != null)
                out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Map<String, String> maps = new HashMap<String, String>();
        maps.put("a", "万达公寓业主：");
        maps.put("b", "输出的内容");
        maps.put("c", "2013年1月23日");
        replaceInTable("C:\\Users\\Administrator\\Desktop\\abc.docx", "C:\\Users\\Administrator\\Desktop\\def.docx",maps);
    }
}