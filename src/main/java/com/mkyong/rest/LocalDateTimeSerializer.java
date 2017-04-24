//package com.mkyong.rest;
//
//import org.codehaus.jackson.JsonGenerator;
//import org.codehaus.jackson.JsonProcessingException;
//import org.codehaus.jackson.map.JsonSerializer;
//import org.codehaus.jackson.map.SerializerProvider;
//
//import java.io.IOException;
//import java.time.Period;
//
//public class LocalDateTimeSerializer extends JsonSerializer<CustomPeriod> {
//    @Override
//    public void serialize(CustomPeriod arg0, JsonGenerator arg1, SerializerProvider arg2) throws IOException, JsonProcessingException {
//        arg1.writeString("type :" + arg0.toString());
//    }
//}