public class Main {
    public static void main(String[] args) {
        // Создаем объект из класса
        BmiService service = new BmiService();
        // Вызываем метод и реузультат присваиваем переменной bodyMassIndex
        float bodyMassIndex = service.calculate(170, 70);
        // Печатаем значение переменной bodyMassIndex
        System.out.println(bodyMassIndex);
    }
}
