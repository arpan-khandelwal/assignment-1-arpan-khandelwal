package project1;

public class mymain {
    public static void main(String[] args) {
        boolean flag = true;
        menu menu = new menu();
        while (flag) {
            int n = menu.showChoice();
            switch (n) {
                case 1:
                    menu.addChoice();
                    break;
                case 2:
                    menu.viewChoice();
                    break;
                case 3:
                    menu.searchChoice();
                    break;
                case 4:
                    menu.deleteChoice();
                    break;
                case 5:
                    menu.exitChoice();
                    flag = false;
                    break;
            }
        }
    }
}