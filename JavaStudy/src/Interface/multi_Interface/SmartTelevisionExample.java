package Interface.multi_Interface;

import Interface.use_Interface.RemoteControl;

public class SmartTelevisionExample {
    SmartTelevision tv = new SmartTelevision();

    RemoteControl rc = tv;
    Searchable searchable = tv;
}
