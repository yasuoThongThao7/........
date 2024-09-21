import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

class RoundedPanel extends JPanel {
    private int cornerRadius;

    public RoundedPanel(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        setOpaque(false);
        setLayout(null);
        setBackground(new Color(255, 255, 255));
        setBounds(50,100,800,500);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius));
    }
}

class EditButton extends DefaultCellEditor{

    private JPanel panel;
    private JButton  deleteButton;

    public EditButton(DefaultTableModel model,int row) {
        super(new JTextField());
        initializePanel(model,row);
    }

    private void initializePanel(DefaultTableModel model,int row) {
        // Khởi tạo JPanel và các nút
        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.setBackground(Color.WHITE);
        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    model.removeRow(row);
                }
            }
        });
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setBackground(new Color(241, 5, 5, 121));
        // Thêm các nút vào panel
        panel.add(deleteButton);
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        return panel; // Trả về JPanel chứa các nút
    }
}
class ScrollPane extends JScrollPane {
    public ScrollPane(JTable table) {
        super(table);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        setBackground(Color.WHITE);
        setBounds(25,50,750,400);
        setBorder(BorderFactory.createEmptyBorder());
    }
}
class TableHeader extends JLabel{
        public TableHeader(String text){
            super(text);
            setOpaque(true);
            setBackground(Color.WHITE);
            setFont(new Font("sansserif",1, 12));
            setForeground(new Color(102,102,102, 197));
            setBorder(new EmptyBorder(10,40,10,5));
        }
}

public class Table extends JTable {

    public Table(DefaultTableModel model) {
        super(model);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setResizingAllowed(false);
        getTableHeader().setBorder(null);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    TableHeader header = new TableHeader(value + " ");
                    return header;
            }
        });
        setDefaultRenderer(Object.class , new DefaultTableCellRenderer(){

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if (column != 4) {
                    Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    component.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    if (isSelected) {
                        component.setForeground(new Color(15,89,140));
                    }
                    else{
                        component.setForeground(new Color(102,102,102));
                    }
                    return component;
                }
                else {
                    EditButton editButton = new EditButton(model,row);
                    return editButton.getTableCellEditorComponent(table, value, isSelected,row, column);
                }
            }
        });

        setShowHorizontalLines(true);
        setRowHeight( 40);
        setBorder(null);
        setShowVerticalLines(false);
    }

}
