public class Task_01 {
    /*
Фишки. Имеется квадратная доска nxn, на крайние поля которой выставлены фишки.
Дано k - количество фишек.
Можно ли разместить все эти фишки, чтобы они заняли все крайние поля доски?
Например, на доску 2x2 можно выставить 4 фишки, а на доску 5x5 - 16.
 */
    public static void main(String[] args) {
        int n = 4;
        int y = 12;
        System.out.println(y==(n*2+((n-2)*2))? "Можно": "Нельзя");

    }
}

