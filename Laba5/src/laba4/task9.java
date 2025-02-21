package laba4;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Про какую киновселенную вы хотели бы прочитать?");
        System.out.println("1. Гарри Поттер  2. Влсастелин Колец");
        System.out.println("3. Marvel        4. DC Comics");
        System.out.println("Выберите цифру от 1 до 4");
        int x = n.nextInt();
        while (x != 1 & x != 2 & x != 3 & x != 4) {
            System.out.println("Похоже что-то пошло не так, повторите попытку");
            x = n.nextInt();
        }
        if (x == 1) {
            System.out.println("Про какой из представленных фильмов вы хотели бы прочитать?");
            System.out.println("1. Гарри Поттер и философский камень");
            System.out.println("2. Гарри Поттер и тайная комната");
            System.out.println("3. Гарри Поттер и узник Азкабана");
            int y = n.nextInt();
            while (y != 1 & y != 2 & y != 3) {
                System.out.println("Похоже что-то пошло не так, повторите попытку");
                y = n.nextInt();
            }
            switch (y) {
                case 1:
                    String stone = "Жизнь десятилетнего Гарри Поттера нельзя назвать сладкой:\n" +
                            "родители умерли, едва ему исполнился год, а от дяди и тёти,\n" +
                            "взявших сироту на воспитание, достаются лишь тычки да подзатыльники.\n" +
                            "Но в одиннадцатый день рождения Гарри всё меняется.\n" +
                            "...";
                    System.out.println(stone);
                    break;
                case 2:
                    String room = "Гарри Поттер переходит на второй курс Школы чародейства и волшебства Хогвартс.\n" +
                            "Эльф Добби предупреждает Гарри об опасности\n" +
                            "и просит больше не возвращаться в школу. Юный волшебник не следует совету эльфа\n" +
                            "и становится свидетелем таинственных событий\n" +
                            "...";
                    System.out.println(room);
                    break;
                case 3:
                    String prisoner = "В третьей части истории о юном волшебнике полюбившиеся всем герои\n" +
                            "возвращаются уже на третий курс школы чародейства и волшебства Хогвартс.\n" +
                            "На этот раз они должны раскрыть тайну узника, сбежавшего из зловещей тюрьмы Азкабан\n" +
                            "...";
                    System.out.println(prisoner);
                    break;
            }
        } else if (x == 2) {
            System.out.println("Про какой из представленных фильмов вы хотели бы прочитать?");
            System.out.println("1. Властелин колец: Братство кольца");
            System.out.println("2. Властелин колец: Две крепости");
            System.out.println("3. Властелин колец: Возвращение Короля");
            int z = n.nextInt();
            while (z != 1 & z != 2 & z != 3) {
                System.out.println("Похоже что-то пошло не так, повторите попытку");
                z = n.nextInt();
            }
            switch (z) {
                case 1:
                    String brotherhood = "Сказания о Средиземье — это хроника Великой войны за Кольцо,\n" +
                            "длившейся не одну тысячу лет. Тихая деревня, где живут хоббиты.\n" +
                            "Придя на 111-й день рождения к своему старому другу Бильбо Бэггинсу,\n" +
                            "волшебник Гэндальф начинает\n" +
                            "...";
                    System.out.println(brotherhood);
                    break;
                case 2:
                    String twocastle = "Братство распалось, но Кольцо Всевластья должно быть уничтожено.\n" +
                            "Фродо и Сэм вынуждены довериться Голлуму, который взялся\n" +
                            "провести их к вратам Мордора. Громадная армия Сарумана приближается\n" +
                            "...";
                    System.out.println(twocastle);
                    break;
                case 3:
                    String returnking = "Повелитель сил тьмы Саурон направляет свою бесчисленную армию\n" +
                            "под стены Минас-Тирита, крепости Последней Надежды. \n" +
                            "Он предвкушает близкую победу, но именно это мешает ему заметить\n" +
                            "две крохотные фигурки — хоббитов\n" +
                            "...";
                    System.out.println(returnking);
                    break;
            }
        } else if (x == 3) {
            System.out.println("Про какой из представленных фильмов вы хотели бы прочитать?");
            System.out.println("1. Железный человек");
            System.out.println("2. Тор");
            System.out.println("3. Человек-паук: Возвращение домой");
            int w = n.nextInt();
            while (w != 1 & w != 2 & w != 3) {
                System.out.println("Похоже что-то пошло не так, повторите попытку");
                w = n.nextInt();
            }
            switch (w) {
                case 1:
                    String ironman = "Миллиардер-изобретатель Тони Старк попадает в плен\n" +
                            "к Афганским террористам, которые пытаются заставить его создать\n" +
                            "оружие массового поражения. В тайне от своих захватчиков Старк\n" +
                            "конструирует высокотехнологичную киберброню,\n" +
                            "которая помогает ему сбежать.\n" +
                            "...";
                    System.out.println(ironman);
                    break;
                case 2:
                    String tor = "Эпическое приключение происходит как на нашей планете Земля,\n" +
                            "так и в королевстве богов Асгарде. В центре истории - Могучий Тор\n" +
                            "cильный, но высокомерный воин, чьи безрассудные поступки\n" +
                            "возрождают древнюю войну в Асгарде.\n" +
                            "...";
                    System.out.println(tor);
                    break;
                case 3:
                    String spiderman = "После встречи с командой Мстителей Питер Паркер\n" +
                            "возвращается домой и пытается жить обычной жизнью под опекой тёти Мэй.\n" +
                            "Но теперь за Питером приглядывает кое-кто ещё.\n" +
                            "...";
                    System.out.println(spiderman);
                    break;
            }
        } else if (x == 4) {
            System.out.println("Про какой из представленных фильмов вы хотели бы прочитать?");
            System.out.println("1. Лига справедливости Зака Снайдера");
            System.out.println("2. Хранители");
            System.out.println("3. Бэтмен (2022)");
            int r = n.nextInt();
            while (r != 1 & r != 2 & r != 3) {
                System.out.println("Похоже что-то пошло не так, повторите попытку");
                r = n.nextInt();
            }
            switch (r) {
                case 1:
                    String league = "Вдохновившись самопожертвованием Супермена, \n" +
                            "Брюс Уэйн вновь обретает веру в человечество. \n" +
                            "Он заручается поддержкой новой союзницы Дианы Принс,\n" +
                            "чтобы сразиться с ещё более могущественным противником.\n" +
                            "...";
                    System.out.println(league);
                    break;
                case 2:
                    String watchmen = "В этом мире супергерои стали частью\n" +
                            "повседневной жизни общества, а Часы Судного Дня, застыв\n" +
                            "в пяти минутах от полуночи, отсчитывают время до столкновения\n" +
                            "ведущих мировых держав.\n" +
                            "...";
                    System.out.println(watchmen);
                    break;
                case 3:
                    String batman = "Когда в городе происходит серия жестоких нападений\n" +
                            "на высокопоставленных чиновников,улики приводят Брюса Уэйна\n" +
                            "в самые тёмные закоулки преступного мира, где он\n" +
                            "...";
                    System.out.println(batman);
                    break;
            }
        }
    }
}