package Library_Business;

import java.awt.Color;
import javax.swing.JTable;

public class BaseUI_Service {
    
    // دالة عامة لتنسيق الهيكل الأساسي لأي جدول
    public void customizeTable(JTable table,Color backColor,Color fgColor) {
        table.setRowHeight(30);
        table.setShowGrid(false);
        table.setSelectionBackground(backColor);
        table.setSelectionForeground(fgColor);
    }
    
    
        
    
}