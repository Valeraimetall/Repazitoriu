import java.util.List;

public class Calculator {

    private Calculator() {
    }

    public static int calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double sum = 0;
        for (MediaItem o : mediaItems) {
            if (o instanceof Movie) {
                sum += o.getRuntime();
            } else {
                Series s;
                s = (Series) o;
                sum += (s.getSeriesCount() * s.getRuntime());
            }

        } sum = (sum/(60*24));
        int day = (int) Math.round (sum);
        return day;
    }
}