package com.test.app.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class BaseController {

    @Autowired
    public HttpServletRequest request;
    @Autowired
    public HttpServletResponse response;

    private static Logger logger = LoggerFactory.getLogger(BaseController.class);
    
    public final String SUCCESS_CODE = "100";
    
    public final String FAIL_CODE = "-100";

    /*public void ajaxResponse(int errorCode, String errorMsg) {
        ajaxResponse(errorCode, errorMsg, null);
    }

    public void ajaxResponse(int errorCode, String errorMsg, JsonObject jsonObject) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        jsonObject.addProperty("errorCode", errorCode);
        jsonObject.addProperty("errorMsg", errorMsg == null ? "null" : errorMsg);
        ajaxResponse(jsonObject.toString());
    }

    public void ajaxResponse(String str) {
        PrintWriter writer = null;
        try {
            response.setCharacterEncoding("UTF8");
            response.setContentType("text/json;charset=UTF-8");
            writer = response.getWriter();
            writer.write(str);
        } catch (Exception e) {
            logger.error("ajax is error.", e);
        } finally {
            if (writer != null) {
                writer.flush();
                writer.close();
            }
        }
    }

    protected JsonObject ajaxReturn(int errorCode, String errorMsg) {
        return ajaxReturn(errorCode, errorMsg, null);
    }

    public JsonObject ajaxReturn(int errorCode, String errorMsg, JsonObject jsonObject) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        jsonObject.addProperty("errorCode", errorCode);
        jsonObject.addProperty("errorMsg", errorMsg == null ? "null" : errorMsg);
        return jsonObject;
    }*/
}
