package sg.edu.nus.iss.app.workshop17.model;

import java.io.Serializable;

import jakarta.json.JsonObject;

public class Condition implements Serializable {
    private String description;
    private String icon;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public static Condition createJson(JsonObject o) {
        Condition c = new Condition();
        c.description = "%s - %s".formatted(o.getString("main"), o.getString("description"));
        c.icon = "http://openweathermap.org/img/wn/" + o.getString("icon") + "@4x.png";
        return c;
    }

}
