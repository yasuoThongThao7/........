import javax.swing.*;
import java.awt.*;

public class JPanelWarehouseExport extends JPanelMini {
    private JLabel text = new JLabel("Xuất kho");
    private JLabel image = new JLabel();

    public JPanelWarehouseExport() {
        //image
        image.setIcon(new ImageIcon("C:\\Users\\admin\\IdeaProjects\\moder\\icons\\rakho.png"));
        image.setBounds(20,2,48,48);
        add(image);
        //text
        text.setFont(new Font("Tahoma", Font.BOLD, 15));
        text.setBounds(130, 10, 100, 30);
        add(text);
        // Thiết lập JPanelHome
        setBounds(0, 370, 280, 60);
        setLayout(null);
        setBackground(new Color(25, 188, 211));
    }
}
class JPanelWarehouseExportMenu extends JPanel{
    public JPanelWarehouseExportMenu() {
        setLayout(null);
        setBackground(new Color(255, 243, 204));
        setBounds(280, 0, 920, 680);
    }
}
