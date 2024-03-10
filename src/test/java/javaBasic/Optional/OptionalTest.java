package javaBasic.Optional;

import org.junit.jupiter.api.Test;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalTest {

    @Test
    void OptionalTest(){

        Map<String, UserVo> tmpMap = new HashMap<>();

//        tmpMap.put("allen", new UserVo(1,"allen","back"));
        tmpMap.put("wesley", new UserVo(2, "wesley","back"));
        tmpMap.put("hooon", new UserVo(3,"hoon", "front"));

        String target = "allen";
        String result = "null";

//        if (getPositionByName(tmpMap, target).isPresent()){
//            result = getPositionByName(tmpMap, target).get();
//        }
//        getPositionByName(tmpMap, target).ifPresent(postion -> {
//            System.out.println(postion);
//        });
//        result = getPositionByName(tmpMap, target).orElse("-");


//        String result = getPositionByName(tmpMap, target).orElseThrow(() ->
//                new IllegalArgumentException("No User Data - Name : "+target));

        System.out.println(result);



    }
    private Optional<String> getPositionByName(Map<String, UserVo> db, String name){
//        Optional<String> tmpResult = Optional.of(db.get(name));
//        return tmpResult;
        return Optional.ofNullable(db.get(name)).map(UserVo::getPosition);

    }
    class UserVo {
        int id;
        String name;
        String position;

        public UserVo(int id, String name, String position) {
            this.id = id;
            this.name = name;
            this.position = position;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }
    }
}
