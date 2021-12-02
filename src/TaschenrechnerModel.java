public class TaschenrechnerModel {

    private int ersterOperand;
    private int zweiterOperand;
    private String operator;

    public int getErgebnis(){
        int rueckgabe = 0;
        if (operator.equals("+")){
            rueckgabe = ersterOperand + zweiterOperand;
        } else if (operator.equals("-")){
            rueckgabe = ersterOperand - zweiterOperand;
        } else {
            rueckgabe = zweiterOperand;
        }
        return rueckgabe;
    }

    public void zurücksetzen(){
        setOperator("null");
    }

    public void setErsterOperand(int opd) {
        this.ersterOperand = opd;
    }

    public void setZweiterOperand(int opd){
        this.zweiterOperand = opd;
    }

    public void setOperator(String op) {
        this.operator = op;
    }

    public static void main(String[] args) {
        TaschenrechnerModel model = new TaschenrechnerModel();

        model.setErsterOperand(29);
        model.setZweiterOperand(18);
        model.setOperator("+");
        System.out.println(model.getErgebnis());

        model.setOperator("-");
        System.out.println(model.getErgebnis());

        model.zurücksetzen();
        System.out.println(model.getErgebnis());
    }
}
