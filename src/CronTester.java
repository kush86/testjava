import org.quartz.CronExpression;

import java.text.ParseException;
import java.util.Date;

public class CronTester {

    public static void main(String[] args) throws ParseException {
        final String expression = "0 0 * * * ?";
        final CronExpression cronExpression = new CronExpression(expression);

        final Date nextValidDate1 = cronExpression.getNextValidTimeAfter(new Date());
        final Date nextValidDate2 = cronExpression.getNextValidTimeAfter(nextValidDate1);
        final Date nextValidDate3 = cronExpression.getNextValidTimeAfter(nextValidDate2);

        System.out.println(nextValidDate1);
        System.out.println(nextValidDate2);
        System.out.println(nextValidDate3);

    }
}