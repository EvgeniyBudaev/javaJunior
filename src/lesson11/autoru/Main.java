package lesson11.autoru;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMainTitle("Hyundai Genesis Couple");
        car.setDatePublication("7 февраля");
        car.setTotalCountViews(733);
        car.setTotalCountViewsToday(27);
        car.setPrice(715000);

        Photo photo1 = new Photo();
        photo1.setPuthToBigPhoto("https://auto.ru/2WAX68k81/f31bc76NObU/7Cppisjv3m_gUKIr4HcllBCNATxSWY1RHJswEHsnqzoYF1uqX505YTQBdw8MpJ_j8Oy-_AezYsjmbpWTPLMzBG07Pc7Z6Ai6sNZlPnAicEYXCJYtVYhO3EHWsVd8puRjHhGT98GOrr4sl6maU2AVP7ynNOxXJLROrLbI16GkLJfq7apAAb1ZIy3HL6-jsq7UDg-JuAARhVRL1jPUuC4nIxzQnvCLTKRxp9NnmpVtVLy5Zbhq0-b-iKB1QpitZWtdJ4");
        photo1.setPuthToSmallPhoto("https://auto.ru/2WAX68k81/f31bc76NObU/7Cppisjv3m_gUKIr4HcllBCNATxSWY1RHJswEHsnqzoYF1uqX534ovXAN48NpUp0Zfjq_sby4t5w7RQGqHIwkTlufA8M6h265NYx6vAy55JADZB7idZB0A3fMJ9ypWuiFh4eugLFb30n3qaWUmmUv3TpfaqU7ThA4_CDGK9hpFLiIujKQfUZJSCDYOGl-yXbwk8JsAHcQVKOG7hcMqeqrxFU3LDNTiuzJxir19FsVjPybb_gUuH7yqz8Ql9lrODYaM");

        Photo photo2 = new Photo();
        photo1.setPuthToBigPhoto("https://auto.ru/2WAX68k81/f31bc76NObU/7Cppisjv3m_gUKIr4HcllBCNATxSWY1RHJswEHsnqzoYF1uqX505YTQBdw8MpJ_j8Oy-_AezYsjmbpWTPLMzBG07Pc7Z6Ai6sNZlPnAicEYXCJYtVYhO3EHWsVd8puRjHhGT98GOrr4sl6maU2AVP7ynNOxXJLROrLbI16GkLJfq7apAAb1ZIy3HL6-jsq7UDg-JuAARhVRL1jPUuC4nIxzQnvCLTKRxp9NnmpVtVLy5Zbhq0-b-iKB1QpitZWtdJ4");
        photo1.setPuthToSmallPhoto("https://auto.ru/2WAX68k81/f31bc76NObU/7Cppisjv3m_gUKIr4HcllBCNATxSWY1RHJswEHsnqzoYF1uqX534ovXAN48NpUp0Zfjq_sby4t5w7RQGqHIwkTlufA8M6h265NYx6vAy55JADZB7idZB0A3fMJ9ypWuiFh4eugLFb30n3qaWUmmUv3TpfaqU7ThA4_CDGK9hpFLiIujKQfUZJSCDYOGl-yXbwk8JsAHcQVKOG7hcMqeqrxFU3LDNTiuzJxir19FsVjPybb_gUuH7yqz8Ql9lrODYaM");

        Photo photo3 = new Photo();
        photo1.setPuthToBigPhoto("https://auto.ru/2WAX68k81/f31bc76NObU/7Cppisjv3m_gUKIr4HcllBCNATxSWY1RHJswEHsnqzoYF1uqX505YTQBdw8MpJ_j8Oy-_AezYsjmbpWTPLMzBG07Pc7Z6Ai6sNZlPnAicEYXCJYtVYhO3EHWsVd8puRjHhGT98GOrr4sl6maU2AVP7ynNOxXJLROrLbI16GkLJfq7apAAb1ZIy3HL6-jsq7UDg-JuAARhVRL1jPUuC4nIxzQnvCLTKRxp9NnmpVtVLy5Zbhq0-b-iKB1QpitZWtdJ4");
        photo1.setPuthToSmallPhoto("https://auto.ru/2WAX68k81/f31bc76NObU/7Cppisjv3m_gUKIr4HcllBCNATxSWY1RHJswEHsnqzoYF1uqX534ovXAN48NpUp0Zfjq_sby4t5w7RQGqHIwkTlufA8M6h265NYx6vAy55JADZB7idZB0A3fMJ9ypWuiFh4eugLFb30n3qaWUmmUv3TpfaqU7ThA4_CDGK9hpFLiIujKQfUZJSCDYOGl-yXbwk8JsAHcQVKOG7hcMqeqrxFU3LDNTiuzJxir19FsVjPybb_gUuH7yqz8Ql9lrODYaM");

        Photo[] photos = new Photo[3];
        photos[0] = photo1;
        photos[1] = photo2;
        photos[2] = photo3;

        car.setPhotos(photos); //добавили наши 3 фото к нашему массиву фотографий

        Reviev reviev1 = new Reviev("классный", "шумит", "можно покупать", 24, 1);
//        reviev1.setTextPlus("Отличное качество");
//        reviev1.setTextMinus("высокая цена");

        Reviev reviev2 = new Reviev();
        reviev1.setTextPlus("Хорошая машина");
        reviev1.setTextMinus("частые поломки");

        Reviev[] revievs = new Reviev[2];
        revievs[0] = reviev1;
        revievs[1] = reviev2;

        car.setRevievs(revievs);
    }
}
