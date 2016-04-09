package chap10;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Represents the slider control panel for the SlideColor program.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class SlideColorPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = 5709983811354286744L;

    /** Panel changes color to current color selected. */
    private JPanel colorPanel;

    /** Slider to indicate red content. */
    private JSlider rSlider;
    /** Slider to indicate green content. */
    private JSlider gSlider;
    /** Slider to indicate blue content. */
    private JSlider bSlider;

    /** Label to show numeric red content, 0..255. */
    private JLabel rLabel;
    /** Label to show numeric green content, 0..255. */
    private JLabel gLabel;
    /** Label to show numeric blue content, 0..255. */
    private JLabel bLabel;

    /**
    * Sets up the sliders and their labels, aligning them along
    * their left edge using a box layout.
    */
    public SlideColorPanel() {
        final int colorPanelSize = 150;
        JPanel controls;

        rSlider = new JSlider();
        initializeSlider(rSlider);

        gSlider = new JSlider();
        initializeSlider(gSlider);

        bSlider = new JSlider();
        initializeSlider(bSlider);

        SliderListener listener = new SliderListener();
        rSlider.addChangeListener(listener);
        gSlider.addChangeListener(listener);
        bSlider.addChangeListener(listener);

        rLabel = new JLabel("Red: 0");
        rLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        gLabel = new JLabel("Green: 0");
        gLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        bLabel = new JLabel("Blue: 0");
        bLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        controls = new JPanel();
        organizeControls(controls);

        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(colorPanelSize,
                colorPanelSize));
        colorPanel.setBackground(new Color(0, 0, 0));

        add(controls);
        add(colorPanel);
    }

    /**
     * Helper method to set up a slider.
     * @param slider The slider to set up
     */
    private void initializeSlider(JSlider slider) {
        final int majorSpacing = 50;
        final int minorSpacing = 10;
        final int sliderMaximum = 255;
        slider.setOrientation(JSlider.HORIZONTAL);
        slider.setMaximum(sliderMaximum);
        slider.setValue(0);
        slider.setMajorTickSpacing(majorSpacing);
        slider.setMinorTickSpacing(minorSpacing);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setAlignmentX(Component.LEFT_ALIGNMENT);

    }

    /**
     * Sets up the controls panel with sliders and labels.
     * @param controls The panel to organize
     */
    private void organizeControls(JPanel controls) {
        final int separation = 20;
        BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
        controls.setLayout(layout);
        controls.add(rLabel);
        controls.add(rSlider);
        controls.add(Box.createRigidArea(new Dimension(0, separation)));
        controls.add(gLabel);
        controls.add(gSlider);
        controls.add(Box.createRigidArea(new Dimension(0, separation)));
        controls.add(bLabel);
        controls.add(bSlider);
    }
    /**
    * Represents the listener for all three sliders.
    */
    private class SliderListener implements ChangeListener {

        /**
        * Gets the value of each slider, then updates the labels and
        * the color panel.
        * @param event Unused
        */
        public void stateChanged(ChangeEvent event) {
            int red = rSlider.getValue();
            int green = gSlider.getValue();
            int blue = bSlider.getValue();

            rLabel.setText("Red: " + red);
            gLabel.setText("Green: " + green);
            bLabel.setText("Blue: " + blue);

            colorPanel.setBackground(new Color(red, green, blue));
        }
    }
}
