package lesson11.homework;

public class Description { //Вкладка "Описание" мыши
    private String text;
    private String color;
    private boolean illumination; //подсветка есть или нет
    private int numberOfButtons; //количество клавиш
    private String typeSensor; //тип сенсора
    private int maxSensorResolution; //максимальное разрешение датчика
    private String typeConnection; //тип подключения

    public Description(){

    }

    public Description(String text, String color, boolean illumination, int numberOfButtons, String typeSensor, int maxSensorResolution, String typeConnection) {
        this.text = text;
        this.color = color;
        this.illumination = illumination;
        this.numberOfButtons = numberOfButtons;
        this.typeSensor = typeSensor;
        this.maxSensorResolution = maxSensorResolution;
        this.typeConnection = typeConnection;
    }
}
