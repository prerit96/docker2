package com.dockertest.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dockertest.docker.pojo.Employee;
import com.dockertest.docker.pojo.RequestDto;
import com.dockertest.docker.pojo.ResponseDto;
import com.dockertest.docker.service.AppService;
import com.mysql.cj.util.StringUtils;

@RestController
public class AppController
{
    @Autowired
    AppService service;

    @PostMapping("/getEmp")
    public ResponseDto getEmp( @RequestBody Employee emp )
    {
        System.out.println( "inside controller" );
        ResponseDto dto = new ResponseDto();
        if ( emp.getEmpId() > 0 )
        {
            System.out.println( "emp id" + emp.getEmpId() );
            dto.setEmpList( service.getEmpById( emp.getEmpId() ) );
        }
        return dto;
    }

    @PostMapping("/getEmpByRecordId")
    public ResponseDto getEmpByRecordId( @RequestBody RequestDto emp )
    {
        System.out.println( "inside controller" );
        ResponseDto dto = new ResponseDto();
        if ( emp.getId() > 0 )
        {
            System.out.println( "inside conditions " + emp.getId() );
            dto.setEmpList( service.getEmpByRecordId( emp.getId() ) );
        }
        return dto;
    }

    @PostMapping("/getAllEmp")
    public ResponseDto getAllEmp()
    {
        System.out.println( "inside controller" );
        ResponseDto dto = new ResponseDto();
        dto.setEmpList( service.getAllEmp());
        return dto;
    }
    //	@GetMapping("/bye")
    //	public ResponseDto bye() {
    //		ResponseDto dto = new ResponseDto();
    //		dto.setEvent("event from bye");
    //		return dto;
    //	}
}
