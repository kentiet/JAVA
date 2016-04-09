package chap07;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 * Demonstrates the use of various types of borders.
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class BorderDemo {
    /** horizontal gap for main panel. */
    private static final int HGAP = 5;
    /** vertical gap for main panel. */
    private static final int VGAP = 10;
    /** border size. */
    private static final int BSIZE = 8;
    /** line thickness. */
    private static final int THICK = 3;
    /** left border thickness. */
    private static final int LTHICK = 5;

    /**
     * Creates several bordered panels and displays them.
     * @param args unused
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, HGAP, VGAP));
        panel.setBorder(
                BorderFactory.createEmptyBorder(BSIZE, BSIZE, BSIZE, BSIZE));

        addLineBorderedLabel(panel);
        addEtchedBorderedLabel(panel);
        addRaisedBevelBorderedLabel(panel);
        addLoweredBevelBorderedLabel(panel);
        addTitledBorderedLabel(panel);
        addTitledRightBorderedLabel(panel);
        addCompoundBorderedLabel(panel);
        addMatteBorderedLabel(panel);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Add line bordered label.
     * @param panel to add to
     */
    private static void addLineBorderedLabel(JPanel panel) {
        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createLineBorder(Color.red, THICK));
        p.add(new JLabel("Line Border"));
        panel.add(p);
    }
    /**
     * Add etched bordered label.
     * @param panel to add to
     */
    private static void addEtchedBorderedLabel(JPanel panel) {
        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createEtchedBorder());
        p.add(new JLabel("Etched Border"));
        panel.add(p);
    }
    /**
     * Add raised bevel bordered label.
     * @param panel to add to
     */
    private static void addRaisedBevelBorderedLabel(JPanel panel) {
        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createRaisedBevelBorder());
        p.add(new JLabel("Raised Bevel Border"));
        panel.add(p);
    }
    /**
     * Add lowered bevel bordered label.
     * @param panel to add to
     */
    private static void addLoweredBevelBorderedLabel(JPanel panel) {
        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createLoweredBevelBorder());
        p.add(new JLabel("Lowered Bevel Border"));
        panel.add(p);
    }
    /**
     * Add titled bordered label.
     * @param panel to add to
     */
    private static void addTitledBorderedLabel(JPanel panel) {
        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createTitledBorder("Title"));
        p.add(new JLabel("Titled Border"));
        panel.add(p);
    }
    /**
     * Add titled (right) bordered label.
     * @param panel to add to
     */
    private static void addTitledRightBorderedLabel(JPanel panel) {
        JPanel p = new JPanel();
        TitledBorder tb = BorderFactory.createTitledBorder("Title");
        tb.setTitleJustification(TitledBorder.RIGHT);
        p.setBorder(tb);
        p.add(new JLabel("Titled Border (right)"));
        panel.add(p);
    }
    /**
     * Add compound bordered label.
     * @param panel to add to
     */
    private static void addCompoundBorderedLabel(JPanel panel) {
        JPanel p = new JPanel();
        Border b1 = BorderFactory.createLineBorder(Color.blue, 2);
        Border b2 = BorderFactory.createEtchedBorder();
        p.setBorder(BorderFactory.createCompoundBorder(b1, b2));
        p.add(new JLabel("Compound Border"));
        panel.add(p);
    }
    /**
     * Add matte bordered label.
     * @param panel to add to
     */
    private static void addMatteBorderedLabel(JPanel panel) {
        JPanel p = new JPanel();
        Border mb = BorderFactory.createMatteBorder(1, LTHICK, 1, 1, Color.red);
        p.setBorder(mb);
        p.add(new JLabel("Matte Border"));
        panel.add(p);
    }
}
