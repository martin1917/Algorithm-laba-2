import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import logic.*;
import ui.UserInterface;

public class App {
    private static UserInterface ui = new UserInterface("Лабораторная работа №2");
    private static Solution solution = new Solution();
    private static List<Integer> list = generateArray(100_000);
	
    public static void main(String[] args) throws Exception {
        addClickListener();

        SwingUtilities.invokeLater(() -> {
			JFrame frame = ui.draw();
            frame.pack();
            frame.setResizable(false);
            frame.setVisible(true);
        });
    }

    private static void addClickListener(){
        ui.getBtnSearch().addActionListener(e -> {
            int target = (int) ui.getSpinnerNum().getValue();

            int indexNonOptimal = solution.nonOptimalBinarySearch(list, target);
            double timeNonOptimal = Measure.getTime(list, target, solution::nonOptimalBinarySearch);

            int indexOptimal = solution.optimalBinarySearch(list, target);
            double timeOptimal = Measure.getTime(list, target, solution::optimalBinarySearch);

            int indexLinear = solution.liniarSearchInSortedlistay(list, target);
            double timeLinear = Measure.getTime(list, target, solution::liniarSearchInSortedlistay);

            ui.getIndexTextFieldNonOptimal().setText("" + indexNonOptimal);
            ui.getTimeTextFieldNonOptimal().setText("" + timeNonOptimal);

            ui.getIndexTextFieldOptimal().setText("" + indexOptimal);
            ui.getTimeTextFieldOptimal().setText("" + timeOptimal);

            ui.getIndexTextFieldLinear().setText("" + indexLinear);
            ui.getTimeTextFieldLinear().setText("" + timeLinear);
        });
    }
    
    private static List<Integer> generateArray(int size){
        Random rand = new Random();
        List<Integer> list = new ArrayList<Integer>(size);
        
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(100_000));
        }

        Collections.sort(list);

        return list;
    }
}
