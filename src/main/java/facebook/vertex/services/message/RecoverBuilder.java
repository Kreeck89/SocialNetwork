package facebook.vertex.services.message;

import facebook.vertex.model.User;
import facebook.vertex.services.MessageBuilder;

public class RecoverBuilder extends MessageBuilder {

    @Override
    public String build(User user) {
        return "Dear "
                + user.getName()
                + " "
                + user.getSurName()
                + " entered wrong number "
                + "\n"
                + "Check your e-mail address.";
    }
}
