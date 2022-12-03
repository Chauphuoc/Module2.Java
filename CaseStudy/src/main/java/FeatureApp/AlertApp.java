package FeatureApp;

public  class AlertApp {
    public static void alertApp(String option) {
        String output = "";
        String confirm = " \033[0;1m[\033[1;92mY\033[0;1m] \033[0;32mYes \033[0m- \033[0;1m[\033[1;92mN\033[0;1m] \033[0;32mNo\033[0m\n";
        if (option.equals("Add-Success"))output = "\033[42m■ Add successfully!\033[0m";
        if (option.equals("Remove-Success")) output = "\033[0;92m■ Product removed successfully!\033[0m\n";
        if (option.equals("Student-Remove-Confirm")) output = "■ Are your sure want to remove this student?" + confirm;
        System.out.println(output);
    }
}
