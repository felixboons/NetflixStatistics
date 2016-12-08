package netflixstatistics;

// @AUTHOR Felix

import java.awt.*;
import javax.swing.*;

 
class ShowAccPanel extends JPanel {
    private final JPanel menu, content;
    private final BannerPanel banner;
    private final NSButton menuAccBtn, menuFilmBtn, menuShowBtn, menuExtraBtn;
    private JLabel titleStatic, averageWatchedStatic;
    private JLabel title, averageWatched;
    private JComboBox showBox, episodeBox;
    
            
    public ShowAccPanel() 
    {
        //Setting layout for hole panel
        setLayout(new BorderLayout());
        
        //Banner
        banner = new BannerPanel();
            
            //Setting dimension for banner
            banner.setPreferredSize(new Dimension(600, 150));
        
        //Menu
        menu = new JPanel();
            
            //Initializing buttons
            menuAccBtn = new NSButton("Account");
            menuFilmBtn = new NSButton("Film");
            menuShowBtn = new NSButton("Show");
            menuExtraBtn = new NSButton("Extra");
        
            //Setting background color for buttons
            menuShowBtn.setBackground(Color.WHITE);//Is white because active
       
            //Setting text color for buttons
            menuShowBtn.setForeground(Color.BLACK);//Is black because active
        
            //adding buttons in menupanel
            menu.add(menuAccBtn);
            menu.add(menuFilmBtn);
            menu.add(menuShowBtn);
            menu.add(menuExtraBtn);
            menu.setLayout(new GridLayout(4,1));
        
        //content
        content = new JPanel();
        content.setSize(600, 250);
        content.setBackground(Color.BLACK);
            
            //setting layout null so setBounds works
            content.setLayout(null);
            
            //Initializing combobox
            showBox = new JComboBox();
            episodeBox = new JComboBox();
            
            //Initializing static labels
            titleStatic = new JLabel("Title:");
            averageWatchedStatic = new JLabel("Average percentage of time watched:");
            
            //Initializing database labels
            title = new JLabel("Too Far Gone");
            averageWatched = new JLabel("100%");
            
            //Setting label colors to white 
            titleStatic.setForeground(Color.WHITE);
            averageWatchedStatic.setForeground(Color.WHITE);
            title.setForeground(Color.WHITE);
            averageWatched.setForeground(Color.WHITE);

            //Setting location of combobox
            showBox.setBounds(50,30,400,25);
            episodeBox.setBounds(50,65,400,25);
           
            //Setting location of  static labels
            titleStatic.setBounds(50,135,200,25);
            averageWatchedStatic.setBounds(50,160,220,25);

            //Setting location of  nonstatic labels
            title.setBounds(350,135,100,25);
            averageWatched.setBounds(350,160,100,25);
            
            //Setting alignment for nonstatic labels
            title.setHorizontalAlignment(SwingConstants.RIGHT);
            averageWatched.setHorizontalAlignment(SwingConstants.RIGHT);
     
            //Adding combobox in contentpanel
            content.add(showBox);
            content.add(episodeBox);
            
            //Adding labels in contentpanel
            content.add(titleStatic);
            content.add(averageWatchedStatic);
            content.add(title);
            content.add(averageWatched);
        
        //Adding panels to Accountpanel
        add(banner, BorderLayout.NORTH);
        add(content, BorderLayout.CENTER);
        add(menu, BorderLayout.WEST);
    }
}