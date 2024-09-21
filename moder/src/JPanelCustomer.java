
import javax.swing.*;
import java.awt.*;

public class JPanelCustomer extends JPanelMini{
        private JLabel text = new JLabel("Khách hàng");
        private JLabel image = new JLabel();

        public JPanelCustomer () {
            image.setIcon(new ImageIcon("C:\\Users\\admin\\IdeaProjects\\moder\\icons\\nhacungcap.png"));
            image.setBounds(20,2,48,48);
            add(image);
            //text
            text.setFont(new Font("Tahoma", Font.BOLD, 15));
            text.setBounds(130, 10, 130, 30);
            add(text);
            // Thiết lập JPanelHome
            setBounds(0, 550, 280, 60);
            setLayout(null);
            setBackground(new Color(25, 188, 211));
        }
}
class JPanelCustomerMenu extends JPanel {
    private JTable jTable;
    private JScrollPane jScrollPane;
    private JPanel panelTable,panelText;
    public JPanelCustomerMenu() {

        setLayout(null);
        setBackground(new Color(239, 239, 239));
        setBounds(280, 0, 920, 680);
    }
}


