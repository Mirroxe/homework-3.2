public class BmiService {
    public int calculate (int weight, double height){ // ввод метода calculate
        double result = weight / (height * height); // рассчитываем индекс массы тела по формуле
        return (int) result; // возвращаем посчитанный индекс в виде целого числа
    }
}
