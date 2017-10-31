package facebook.vertex.services.message;

import facebook.vertex.model.User;
import facebook.vertex.services.MessageBuilder;

public class ChangeMailBuilder extends MessageBuilder {

    @Override
    public String build(User user) {
        return user.getName()
                + " "
                + user.getSurName()
                + ", you change your e-mail."
                + "\n"
                + "Check for confirm";
    }
}
