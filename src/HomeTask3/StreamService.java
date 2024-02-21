package HomeTask3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    public List<Stream> sortStreamsByGroupSize(List<Stream> streams) {
        List<Stream> streamList = new ArrayList<>(streams);
        Collections.sort(streamList, new StreamComparator());
        return streamList;
    }
}
