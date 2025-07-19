import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class history extends JFrame implements ActionListener{
    private JButton preBt,cusBt,hisBt,infBt;
    private JLabel tital;
    private JScrollPane sp;
    private JTable table;
    private DefaultTableModel model;
	private Login login_Obj;
	private CustomerInfo CustomerInfo_obj;

    public history(Login login_Obj,CustomerInfo CustomerInfo_obj){
        super("HISTORY");
		this.login_Obj=login_Obj;
		this.CustomerInfo_obj=CustomerInfo_obj;
        
        Object[][] data={{"Pranto","pranto@gmail.com","22/5/2023",2,"Cox's Bazar",10000}};
        String cName[]={"Name","Email","Purchase Date","No of Day","Place","Amount"};

        model=new DefaultTableModel(data,cName);
        table=new JTable(model);
        table.setForeground(Color.BLACK);
        
        sp=new JScrollPane(table);
        sp.setBounds(40,120,710,300);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        tital=new JLabel("YOUR PURCHASE HISTORY");
        tital.setFont(new Font("Cooper Black",Font.BOLD, 38));
        tital.setForeground(Color.WHITE);
        tital.setBounds(100,40,750,100);

        infBt=new JButton("CUSTOMER INFO");
        infBt.setBounds(45,20,150,30);
        infBt.setForeground(Color.white);
        infBt.setBackground(Color.DARK_GRAY);//light blue
        infBt.addActionListener(this);

		preBt=new JButton("PRE-MADE PACKS");
        preBt.setBounds(225,20,150,30);
        preBt.setForeground(Color.white);
        preBt.setBackground(Color.DARK_GRAY);
        preBt.addActionListener(this);

		cusBt=new JButton("CUSTOM PACK");
        cusBt.setBounds(405,20,150,30);
        cusBt.setForeground(Color.WHITE);
        cusBt.setBackground(Color.DARK_GRAY);
        cusBt.addActionListener(this);

		hisBt=new JButton("HISTORY");
        hisBt.setBounds(585,20,150,30);
        hisBt.setForeground(Color.BLACK);
        hisBt.setBackground(Color.LIGHT_GRAY);
        hisBt.addActionListener(this);

        setSize(800,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
		getContentPane().setBackground(Color.decode("#477977"));
        setVisible(true);

        add(sp);
        add(preBt);
        add(cusBt);
        add(hisBt);
        add(infBt);
        add(tital);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==infBt){
            setVisible(false);
            new CustomerInfo(login_Obj);
        }else if(e.getSource()==cusBt){
            setVisible(false);
            new cPack(login_Obj,CustomerInfo_obj );
        }else if(e.getSource()==preBt){
            setVisible(false);
            new pPack(login_Obj,CustomerInfo_obj);
        }
    }
    
    public static void main(String[]args){
        new history(new Login(),new CustomerInfo(new Login()));
    }
}
