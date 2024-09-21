import javax.swing.*;
import java.awt.*;

public class JPanelEnterWarehouse extends JPanelMini {
    private JLabel text = new JLabel("Nhập kho");
    private JLabel image = new JLabel();
    public JPanelEnterWarehouse() {
        //image
        image.setIcon(new ImageIcon("C:\\Users\\admin\\IdeaProjects\\moder\\icons\\vaokho.png"));
        image.setBounds(20,2,48,48);
        add(image);
        //text
        text.setFont(new Font("Tahoma", Font.BOLD, 15));
        text.setBounds(130, 10, 100, 30);
        add(text);
        // Thiết lập JPanelHome
        setBounds(0, 310, 280, 60);
        setLayout(null);
        setBackground(new Color(25, 188, 211));
    }
}
class JPanelEnterWarehouseMenu extends JPanel {
    public JPanelEnterWarehouseMenu() {
        setLayout(null);
        setBackground(new Color(0, 255, 111));
        setBounds(280, 0, 920, 680);
    }
}
