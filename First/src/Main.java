public class Main {
    public static void main(String[] args){
        FirstUI mySw= new FirstUI();
        Thread zing = new Thread(mySw);
        zing.start();
        mySw.setVisible(true);
    }
}
