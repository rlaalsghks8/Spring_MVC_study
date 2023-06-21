package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {
    
    /**
     * 회원저장
     * 회원목록조회: GET       /users
     * 회원등록:         POST     /users
     * 회원조회:         GET        /users/{userId}
     * 회원수정:         PATCH  /users/{userId}
     * 회원삭제:         DELETE /users/{userId}
     *
     */

    @GetMapping
    public String user(){
        return "get users";
    }

    @PostMapping
    public String addUser(){
        return "post user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId){

        return "get userId=" + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId){

        return "update userId=" + userId;
    }

    @DeleteMapping("/{userId}")
    public String delete(@PathVariable String userId){

        return "delete userId=" + userId;
    }
}
