public class NumberCruncherUser { //uses methods in NumberCruncher
    public static void main(String[] args) {
        int count = 1;
        NumberCruncher numb = new NumberCruncher();
        System.out.println("N" + "\t" + "SQUARE" + "\t" + "CUBE");
        while (count <= 5) {
            System.out.println(count + "\t" + numb.square(count) + "\t" + numb.cube(count));
            count += 1;
        }
    }
}
/*
░░░░░░░░░░░░░░░░░░▄ ████████████████████▄ ▄░░░░░░░░░░░░░░░░
░░░░░░░░░░░░▄██████████████████████████████████ ▄░░░░░░░░░░
░░░░░░░░░░██████▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀ ▀██████████████░░░░░░░░
░░░░░░░░███░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█████████████░░░░░░
░░░░░░█ █░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░███████████████░░░░
░░░░░░█ ▀░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▀██████████████░░░░
░░░░░░█ ▄ ▄████ ▄░░░░░░░▀ █ █ █ █ █ ▄░░░░░▀████████████░░░░
░░░░░░█ ▀ ██████▄ ▀ ░ ░ ░ ▄ █ █ ▄ ▄ █ ▀░░░░░░░██████████▄░░
░░░░░░█░░░░░▀█▀██░░░░░░░░░░░▀ ▀░░░░░░░▀░░░░░░░███░░░░░▀ ▄██
░░░░░░█░░░░░░░█░░░░░░░▄░░░░░░░░░░░░░░░░░░░░░░░░░░░███░░░███
░░░░░░█░░░░░█ ▄ ▄ ▄ ▄ █ ▄ ▀ ▄░░░░░░░░░░░░░░░░░░░▄█▄██ ▄██░░
░░░░░░█░░░░░█ ▄ ▄ ▄ ▄ ▄ ▄░░░▀ ▄░░░░░░░░░░░░░░░░░▄░░░▀██░░░░
░░░░░░█░░░█ ▄ ██████████▀██ ▄ ▀░░░░░░░░░░░░░░░█░░░▀ ▀░░░░░░
░░░░░░░░█ █ ▀░░░▄ ▄ ▄ ▄░░░░░░░▄ ▀░░░░░░░░░▄ ▀ █░░░░░░░░░░░░
░░░░░░░░░░█ ▄ ▀░░░░░░░░░▀ █ ▀ █ ▀░░░▄ ▄ ▀░░░▄ ▀░░░░░░░░░░░░
░░░░░░░░░░▀ ▄░░░░░░░░░░░░░░░░░▄ ▄ ▀░░░░░░░░░█░░░░░░░░░░░░░░
░░░░░░░░░░▄ █ █ ▀ ▀ ▀ ▀ ▀ ▀ ▀░░░░░░░░░░░░░░░█ ▄░░░░░░░░░░░░
░░░░▄ ▄ ▀░░░░░░░▀ ▄░░░░░░░░░░░░░░░░░░░░░▄ ▀░░░▀ ▀ ▄░░░░░░░░
▄ ▀ ▀░░░░░░░░░░░░░░░█ ▄░░░░░░░░░░░░░▄ ▀░░░░░░░░░░░░░█ ▄░░░░
█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▀ █ ▄
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
█▄░░█ █▀▀█ ▀▀█▀▀░░█▀▀█ █▀▀█ █▀▀▄
█░█░█ █░░█ ░░█░░░░█▀▀▄ █▄▄█ █░░█
█░░▀█ █▄▄█ ░░█░░░░█▄▄█ █░░█ █▄▄▀
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 */