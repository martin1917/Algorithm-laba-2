package ui;

import javax.swing.*;
import java.awt.*;

public class UserInterface {
    private JFrame frame;
	
    private JPanel panelForSetValue;
    private JLabel valueLabel;	
    private JSpinner spinnerNum;
	
    private JPanel panelNonOptimal;	
    private JPanel panelForTitleNonOptimal;
    private JLabel titleNonOptimal;
    private JLabel indexLabelNonOptimal;
    private JTextField indexTextFieldNonOptimal;
    private JLabel timeLabelNonOptimal;
    private JTextField timeTextFieldNonOptimal;
	
    private JPanel panelOptimal;
    private JPanel panelForTitleOptimal;
    private JLabel titleOptimal;
    private JLabel indexLabelOptimal;
    private JTextField indexTextFieldOptimal;
    private JLabel timeLabelOptimal;
    private JTextField timeTextFieldOptimal;
	
    private JPanel panelLinear;
	private JPanel panelForTitleLinear;
    private JLabel titleLinear;
    private JLabel indexLabelLinear;
    private JTextField indexTextFieldLinear;
    private JLabel timeLabelLinear;
    private JTextField timeTextFieldLinear;
	
    private JPanel panelForButtonSearch;
    private JButton btnSearch;

    {
        JFrame.setDefaultLookAndFeelDecorated(true);
		frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        panelForSetValue = new JPanel(new FlowLayout(FlowLayout.CENTER));
        valueLabel = new JLabel("Ключ");
        valueLabel.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        valueLabel.setForeground(new Color(0, 0, 128));

        spinnerNum = new JSpinner(new SpinnerNumberModel(10, Integer.MIN_VALUE, Integer.MAX_VALUE, 1));
        spinnerNum.setFont(new Font("Times New Roman", Font.ITALIC, 18));

        panelNonOptimal = new JPanel(new GridBagLayout());		
        
        panelForTitleNonOptimal = new JPanel(new FlowLayout(FlowLayout.CENTER));
		titleNonOptimal = new JLabel("Неоптимальный бинарный");        
        titleNonOptimal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        titleNonOptimal.setForeground(new Color(0, 128, 96));   
		
        indexLabelNonOptimal = new JLabel("Индекс");
        indexLabelNonOptimal.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        indexLabelNonOptimal.setForeground(new Color(128, 53, 185));
        
        indexTextFieldNonOptimal = new JTextField(15);
        indexTextFieldNonOptimal.setEditable(false);
        indexTextFieldNonOptimal.setBackground(Color.WHITE);
        indexTextFieldNonOptimal.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        
        timeLabelNonOptimal = new JLabel("Время (мкс)");
        timeLabelNonOptimal.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        timeLabelNonOptimal.setForeground(new Color(128, 53, 185));

        timeTextFieldNonOptimal = new JTextField(15);
        timeTextFieldNonOptimal.setEditable(false);
        timeTextFieldNonOptimal.setBackground(Color.WHITE);
        timeTextFieldNonOptimal.setFont(new Font("Times New Roman", Font.ITALIC, 18));

        panelOptimal = new JPanel(new GridBagLayout());
        
        panelForTitleOptimal = new JPanel(new FlowLayout(FlowLayout.CENTER));  
		titleOptimal = new JLabel("Оптимальный бинарный");        
        titleOptimal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        titleOptimal.setForeground(new Color(0, 128, 96)); 
		
        indexLabelOptimal = new JLabel("Индекс");
        indexLabelOptimal.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        indexLabelOptimal.setForeground(new Color(128, 53, 185));
        
        indexTextFieldOptimal = new JTextField(15);
        indexTextFieldOptimal.setEditable(false);
        indexTextFieldOptimal.setBackground(Color.WHITE);
        indexTextFieldOptimal.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        
        timeLabelOptimal = new JLabel("Время (мкс)");
        timeLabelOptimal.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        timeLabelOptimal.setForeground(new Color(128, 53, 185));
        
        timeTextFieldOptimal = new JTextField(15);
        timeTextFieldOptimal.setEditable(false);
        timeTextFieldOptimal.setBackground(Color.WHITE);
        timeTextFieldOptimal.setFont(new Font("Times New Roman", Font.ITALIC, 18));

        panelLinear = new JPanel(new GridBagLayout());      
		
		panelForTitleLinear = new JPanel(new FlowLayout(FlowLayout.CENTER));
		titleLinear = new JLabel("Оптимальный последовательный");        
        titleLinear.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        titleLinear.setForeground(new Color(0, 128, 96));
        
        indexLabelLinear = new JLabel("Индекс");
        indexLabelLinear.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        indexLabelLinear.setForeground(new Color(128, 53, 185));
        
        indexTextFieldLinear = new JTextField(15);
        indexTextFieldLinear.setEditable(false);
        indexTextFieldLinear.setBackground(Color.WHITE);
        indexTextFieldLinear.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        
        timeLabelLinear = new JLabel("Время (мкс)");
        timeLabelLinear.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        timeLabelLinear.setForeground(new Color(128, 53, 185));
        
        timeTextFieldLinear = new JTextField(15);
        timeTextFieldLinear.setEditable(false);
        timeTextFieldLinear.setBackground(Color.WHITE);
        timeTextFieldLinear.setFont(new Font("Times New Roman", Font.ITALIC, 18));

        panelForButtonSearch = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnSearch = new JButton("Найти");
        btnSearch.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
        btnSearch.setForeground(Color.RED);
    }

    public UserInterface(String title){
        frame.setTitle(title);
    }

    public JFrame draw(){
        //#region Set value
        panelForSetValue.add(valueLabel);
        panelForSetValue.add(spinnerNum);
        //#endregion Set value

        //#region non-optimal
		panelForTitleNonOptimal.add(titleNonOptimal);
		
        panelNonOptimal.add(panelForTitleNonOptimal, new GridBagConstraints(0, 0, 2, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 1, 2, 1), 0, 0)
        );

        panelNonOptimal.add(indexLabelNonOptimal, new GridBagConstraints(0, 1, 1, 1, 0.2, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 1, 2, 1), 0, 0)
        );

        panelNonOptimal.add(indexTextFieldNonOptimal, new GridBagConstraints(1, 1, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 1, 2, 1), 0, 0)
        );

        panelNonOptimal.add(timeLabelNonOptimal, new GridBagConstraints(0, 2, 1, 1, 0.2, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 1, 2, 1), 0, 0)
        );

        panelNonOptimal.add(timeTextFieldNonOptimal, new GridBagConstraints(1, 2, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 1, 2, 1), 0, 0)
        );
        //#endregion non-optimal

        //#region optimal
        panelForTitleOptimal.add(titleOptimal);

        panelOptimal.add(panelForTitleOptimal, new GridBagConstraints(0, 0, 2, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 1, 2, 1), 0, 0)
        );

        panelOptimal.add(indexLabelOptimal, new GridBagConstraints(0, 1, 1, 1, 0.2, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 1, 2, 1), 0, 0)
        );

        panelOptimal.add(indexTextFieldOptimal, new GridBagConstraints(1, 1, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 1, 2, 1), 0, 0)
        );

        panelOptimal.add(timeLabelOptimal, new GridBagConstraints(0, 2, 1, 1, 0.2, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 1, 2, 1), 0, 0)
        );

        panelOptimal.add(timeTextFieldOptimal, new GridBagConstraints(1, 2, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 1, 2, 1), 0, 0)
        );
        //#endregion optimal

        //#region liniar search
        panelForTitleLinear.add(titleLinear);

        panelLinear.add(panelForTitleLinear, new GridBagConstraints(0, 0, 2, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 1, 2, 1), 0, 0)
        );

        panelLinear.add(indexLabelLinear, new GridBagConstraints(0, 1, 1, 1, 0.2, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 1, 2, 1), 0, 0)
        );

        panelLinear.add(indexTextFieldLinear, new GridBagConstraints(1, 1, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 1, 2, 1), 0, 0)
        );

        panelLinear.add(timeLabelLinear, new GridBagConstraints(0, 2, 1, 1, 0.2, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 1, 2, 1), 0, 0)
        );

        panelLinear.add(timeTextFieldLinear, new GridBagConstraints(1, 2, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 1, 2, 1), 0, 0)
        );
        //#endregion liniar search

        //#region button for searching
        panelForButtonSearch.add(btnSearch);
        //#endregion button for searching
        
        //#region main frame
        frame.add(panelForSetValue, new GridBagConstraints(0, 0, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(5, 20, 5, 20), 0, 0)
        );

        frame.add(panelNonOptimal, new GridBagConstraints(0, 1, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(5, 20, 5, 20), 0, 0)
        );

        frame.add(panelOptimal, new GridBagConstraints(0, 2, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(5, 20, 5, 20), 0, 0)
        );

        frame.add(panelLinear, new GridBagConstraints(0, 3, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(5, 20, 5, 20), 0, 0)
        );

        frame.add(panelForButtonSearch, new GridBagConstraints(0, 4, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(5, 20, 5, 20), 0, 0)
        );
        //#endregion main frame

        return frame;
    }

    //#region Getters
    public JSpinner getSpinnerNum(){
        return spinnerNum;
    }

    public JTextField getIndexTextFieldNonOptimal(){
        return indexTextFieldNonOptimal;
    }

    public JTextField getTimeTextFieldNonOptimal(){
        return timeTextFieldNonOptimal;
    }

    public JTextField getIndexTextFieldOptimal(){
        return indexTextFieldOptimal;
    }

    public JTextField getTimeTextFieldOptimal(){
        return timeTextFieldOptimal;
    }

    public JTextField getIndexTextFieldLinear(){
        return indexTextFieldLinear;
    }
    
    public JTextField getTimeTextFieldLinear(){
        return timeTextFieldLinear;
    }

    public JButton getBtnSearch(){
        return btnSearch;
    }
    //#endregion Getters
}
