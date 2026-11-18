package pr2.part11;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    private String name;
    private String group;
    private Date birthDate;

    public Student(String name, String group, Date birthDate) {
        this.name = name;
        this.group = group;
        this.birthDate = birthDate;
    }

    public String getName() { return name; }
    public String getGroup() { return group; }
    public Date getBirthDate() { return birthDate; }

    /** style: DateFormat.SHORT, DateFormat.MEDIUM, DateFormat.LONG или DateFormat.FULL */
    public String getBirthDateString(int style) {
        DateFormat df = DateFormat.getDateInstance(style, Locale.forLanguageTag("ru-RU"));
        return df.format(birthDate);
    }

    public String getBirthDateString(String pattern) {
        return new java.text.SimpleDateFormat(pattern, Locale.forLanguageTag("ru-RU")).format(birthDate);
    }

    @Override
    public String toString() {
        return name + ", группа " + group + ", родился: " + getBirthDateString(DateFormat.MEDIUM);
    }
}
