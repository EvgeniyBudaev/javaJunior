package lesson11.homework;

public class Characteristics { //Вкладка "Характеристики"
    private String model;
    private String colorMain;
    private String colorComplementary; //дополнительный цвет
    private boolean illumination; //подсветка
    private int numberOfButtons; //количество клавиш
    private int maxSensorResolution; //максимальное разрешение датчика
    private String materialOfManufacture; //материал изготовления
    private String coatingMaterial; //материал покрытия
    private String typeConnection; //тип подключения
    private String connectionInterFace; //интерфейс подключения
    private int radius; //радиус действия беспроводной связи
    private boolean coil; //катушка для кабеля есть или нет
    private String typePowerSupply; //тип источника питания
    private int batteryLife; //время автономной работы
    private String picking; //комплектация
    private int width; //ширина
    private int height; //высота
    private int length; //длина

    public Characteristics(){

    }

    public Characteristics(String model, String colorMain, String colorComplementary, boolean illumination, int numberOfButtons, int maxSensorResolution, String materialOfManufacture, String coatingMaterial, String typeConnection, String connectionInterFace, int radius, boolean coil, String typePowerSupply, int batteryLife, String picking, int width, int height, int length) {
        this.model = model;
        this.colorMain = colorMain;
        this.colorComplementary = colorComplementary;
        this.illumination = illumination;
        this.numberOfButtons = numberOfButtons;
        this.maxSensorResolution = maxSensorResolution;
        this.materialOfManufacture = materialOfManufacture;
        this.coatingMaterial = coatingMaterial;
        this.typeConnection = typeConnection;
        this.connectionInterFace = connectionInterFace;
        this.radius = radius;
        this.coil = coil;
        this.typePowerSupply = typePowerSupply;
        this.batteryLife = batteryLife;
        this.picking = picking;
        this.width = width;
        this.height = height;
        this.length = length;
    }
}
