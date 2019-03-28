package lesson11.homework;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Mouse defenderLagunaMS245 = new Mouse("Компактная мышь беспроводная Defender Laguna MS-245 зеленый",
                399, 4.8, 6, "Китай", 7925714);

        Description description = new Description("Компактная мышь беспроводная Defender Laguna MS-245 зеленый",   //Вкладка "Описание" мыши
                "зеленый", false, 3, "Оптический светодиодный",
                1000, "беспроводная");

        Characteristics сharacteristics = new Characteristics("Defender Laguna MS-245", "зеленый",      //Вкладка "Характеристики"
                "серый", false, 3, 1000,
                "пластик", "глянцевый пластик", "беспроводная",
                "USB", 10, false, "батарейка ААА", 180,
                "документация, наноприемник", 51, 21, 93);

        Otzivi otzivi1 = new Otzivi("Мышью пользуется супруга (работает учителем в школе и там удобно " +     //Вкладка "Отзывы"
                "использовать беспроводную для перемещения по классу и листания слайдов). Нареканий нет",
                "Нет", 5, 0);

        Otzivi otzivi2 = new Otzivi("Цена,дизайн,качество.", "Их нет.",
                "Хорошая мышка за свои деньги и хорошо работает.", 0, 0);

        Otzivi otzivi3 = new Otzivi("Красивая. Компактная. Недорогая.", "Тормозит немного.",
                "Изначально брала себе на работу в офис. Сразу поняла, что для таких дел не подходит. " +
                        "Троила, оперативно что-то сделать ей было неудобно. В итоге отправила домой, для домашнего " +
                        "использования - самое то. сам корпус в косяках пластика, не заморачивались ребята чтобы все " +
                        "было ровненько и гладенько. Но в общем вполне миленькая и годная для неторопливого блуждания " +
                        "в просторах интернета.", 4, 0);

        Otzivi otzivi4 = new Otzivi("приобреталась мышь для работы с телевизором. за эти деньги мышь просто идеальна. ",
                "что нужно для мыши которая валяется на диване в гостиной \n" +
                "1 симпатичная\n" +
                "2 большой радиус действия\n" +
                "3 не жрать батарейки\n" +
                "\n" +
                "все это есть", "пока не обнаружил", 0, 0);

        Otzivi[] otzivi = new Otzivi[4];
        otzivi[0] = otzivi1;
        otzivi[1] = otzivi2;
        otzivi[2] = otzivi3;
        otzivi[3] = otzivi4;

        defenderLagunaMS245.setOtzivi(otzivi);

        ArrayList <Komentarii> koment = new ArrayList<>(); //будет создано комментариев столько колько нужно
        defenderLagunaMS245.setKoment(koment);


        Photo photo1 = new Photo();
        photo1.setLargePhoto("https://c.dns-shop.ru/thumb/st1/fit/wm/800/650/6ca94dee8ad52e10c0becc8d487b8ac4/cc1b49d92a41d3ab3d12e06a070dd25054d5bf228b5425afebbf8eff4f789f63.jpg");
        photo1.setSmallPhoto("https://c.dns-shop.ru/thumb/st1/fit/45/45/7eb87394b21108e79dfecfebc5043c37/cc1b49d92a41d3ab3d12e06a070dd25054d5bf228b5425afebbf8eff4f789f63.jpg");

        Photo photo2 = new Photo();
        photo2.setLargePhoto("https://c.dns-shop.ru/thumb/st4/fit/wm/800/650/5b65293626a74923455d6e4fc3214658/86ef8cb52318dda0f821282a2255ce82455edebc9b0fcd670f8f48ec420199d0.jpg");
        photo2.setSmallPhoto("https://c.dns-shop.ru/thumb/st4/fit/45/45/0d7ec9bfb951f9a5085d35f3917561f5/86ef8cb52318dda0f821282a2255ce82455edebc9b0fcd670f8f48ec420199d0.jpg");

        Photo photo3 = new Photo();
        photo3.setLargePhoto("https://c.dns-shop.ru/thumb/st1/fit/wm/800/650/fdaa3d2d5c04fecdbab63811ef28b239/1d13b1ebf0af515e20717d73641b5b078c2a3c0e3fd781a2a1b65b6e4113e135.jpg");
        photo3.setSmallPhoto("https://c.dns-shop.ru/thumb/st1/fit/45/45/22c3e1d2ea16da41099e029cd428ae66/1d13b1ebf0af515e20717d73641b5b078c2a3c0e3fd781a2a1b65b6e4113e135.jpg");

        Photo photo4 = new Photo();
        photo4.setLargePhoto("https://c.dns-shop.ru/thumb/st4/fit/wm/800/650/b0309403a73573871ea7031e13fabfe7/7d6839006ff5f5b27f9a288074981c9a2681c6d04ee6bed74de3faefd493bace.jpg");
        photo4.setSmallPhoto("https://c.dns-shop.ru/thumb/st4/fit/45/45/df9608aa16707cb7c5ef6866cd8ffa1b/7d6839006ff5f5b27f9a288074981c9a2681c6d04ee6bed74de3faefd493bace.jpg");

        Photo photo5 = new Photo();
        photo5.setLargePhoto("https://c.dns-shop.ru/thumb/st4/fit/wm/800/650/52473b9f82ecd23cb8d57d78bc18ae89/d989d0b0cf9a8aa82a21e5c7beeab67aea2ef57786bba0a95e15972329bffc68.jpg");
        photo5.setSmallPhoto("https://c.dns-shop.ru/thumb/st4/fit/45/45/f2ecebd181ad2ccd860ffcae8fd0a6a5/d989d0b0cf9a8aa82a21e5c7beeab67aea2ef57786bba0a95e15972329bffc68.jpg");

        Photo photo6 = new Photo();
        photo6.setLargePhoto("https://c.dns-shop.ru/thumb/st4/fit/wm/800/650/8e5018bd8a2377b6b8e7ca73e0b1ed6e/8cfb5b6600d88b38f0ccd51846877f63fe004c5da891ffe234e9df44582aab70.jpg");
        photo6.setSmallPhoto("https://c.dns-shop.ru/thumb/st4/fit/45/45/62d38772722315a7dba7ea4b38499340/8cfb5b6600d88b38f0ccd51846877f63fe004c5da891ffe234e9df44582aab70.jpg");

        Photo photo7 = new Photo();
        photo7.setLargePhoto("https://c.dns-shop.ru/thumb/st4/fit/wm/800/650/f39927eb78aa7563626cfcf8176d46a7/1a84c6c746640e360abaaa7f60f783c30c90247551d9fae2cc20c1d0d5a945e6.jpg");
        photo7.setSmallPhoto("https://c.dns-shop.ru/thumb/st4/fit/wm/800/650/f39927eb78aa7563626cfcf8176d46a7/1a84c6c746640e360abaaa7f60f783c30c90247551d9fae2cc20c1d0d5a945e6.jpg");

        Photo photo8 = new Photo();
        photo8.setLargePhoto("https://img.youtube.com/vi/NGCe6Xec1kY/mqdefault.jpg");
        photo8.setSmallPhoto("http://savefrom.net/?url=https%3A%2F%2Fwww.youtube.com%2Fembed%2FNGCe6Xec1kY%3Fhd%3D1%26rel%3D0%26showinfo%3D0%26wmode%3Dopaque%26enablejsapi%3D1&utm_source=userjs-chrome&utm_medium=extensions&utm_campaign=link_modifier");

        Photo[] photos = new Photo[8];
        photos[0] = photo1;
        photos[1] = photo2;
        photos[2] = photo3;
        photos[3] = photo4;
        photos[4] = photo5;
        photos[5] = photo6;
        photos[6] = photo7;
        photos[7] = photo8;

        defenderLagunaMS245.setPhotos(photos);

    }
}
