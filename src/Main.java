public class Main {
    public static void main(String[] args){
        BmiService service = new BmiService(); //ввод нового объекта
        int weight = 98; // вес в кг
        double height = 1.87; // рост в метрах
        int bmiIndex = service.calculate(weight, height); // вызываем метод calculate
        System.out.println("Индекс массы тела : " + bmiIndex); // вывод резуальтата на экран

    }
}