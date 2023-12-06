package data;

import use_cases.create_to_do_list.CreateToDoListDataAccessInterface;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

public class FileListDataAccessObject implements CreateToDoListDataAccessInterface {
    private final File csvFile;
    private final Map<String, Integer> headers = new LinkedHashMap<>();

    public FileListDataAccessObject(String csvPath) {
        csvFile = new File(csvPath);
        headers.put("list_name", 0);

        if (csvFile.length() == 0) {

        }
    }

    @Override
    public void save(String listName) {

    }
}
