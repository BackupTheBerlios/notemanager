 /*
 * 
 *
 */
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

/**
 * @author jrichert
 *
 */
public class JuryTableColumnModel  extends DefaultTableColumnModel {

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;


    /**
     *Instance juryTableColumnModel with juryTableModel's  headername.
     *@param model is use for heder's name value. 
     */
    public JuryTableColumnModel(JuryTableModel model)
    {
    super(); 

    for(int i=0;i < model.getColumnCount();i++)
        {
        TableColumn column = new TableColumn(i);
        System.out.println("Model "+model.getColumnName(i));
        column.setHeaderValue(model.getColumnName(i));
    
        this.addColumn(column);
        }
    }

    
    
    
    
    
    
    
    
    
}
