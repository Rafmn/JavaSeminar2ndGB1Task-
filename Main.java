public class Main {
    public static void main(String[] args) {
        Person irina = new PersonIrina("Ирина", 35);
        Person vasya = new PersonIrina("Вася", 5);
        Person vasya1 = new PersonIrina("Вася", 45);
        Person masha = new PersonIrina("Маша", 4);
        Person jane = new PersonIrina("Женя", 7);
        Person ivan = new PersonIrina("Ваня", 3);
        Person ivanPetrovich = new PersonIrina("Иван Петрович", 60);
        Person mariaAleksandrovna = new PersonIrina("Мария Александровна", 55);
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya1, jane);
        gt.append(vasya1, ivan);
        gt.appendG(ivanPetrovich, vasya);
        gt.appendG(mariaAleksandrovna, vasya);
        gt.addendBS(ivan, jane);

        System.out.println("Вывод детей irina:");
        System.out.println(new Reserch(gt).spend(irina, Relationship.parent));
        System.out.println("Вывод дедушек и бабушек vasya:");
        System.out.println(new Reserch(gt).spend(vasya, Relationship.grandchildren)); // Вывод дедушек и бабушек vasya
        System.out.println("Вывод всех людей с отношениями grandparents:");
        System.out.println(new Reserch(gt).spend1(Relationship.grandparents)); // Вывод всех людей с отношениями grandparents
        System.out.println("Вывод всех людей старше 10:");
        System.out.println(new Reserch(gt).spend2(10)); // Вывод всех людей старше 10
        System.out.println("Вывод людей старше vasya:");
        System.out.println(new Reserch(gt).spend3(vasya)); // Вывод людей старше vasya

        WriteFile writeF = new WriteFile(gt);
        System.out.println();
        System.out.println("Вывод всего списка:");
        System.out.println(writeF.spend());
    }
}