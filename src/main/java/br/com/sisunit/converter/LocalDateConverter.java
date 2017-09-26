///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.com.sisunit.converter;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import javax.persistence.AttributeConverter;
//import javax.persistence.Converter;
//
///**
// *
// * @author Kaique Candido kaiqueoliveira.ci@gmail.com
// */
//@Converter(autoApply = true)
//public class LocalDateConverter implements AttributeConverter<String, LocalDate> {
//
//    public final String DATE_FORMAT = "dd/MM/yyyy";
//
//    @Override
//    public LocalDate convertToDatabaseColumn(String attribute) {
//        return attribute == null ? null : LocalDate.parse(attribute, DateTimeFormatter.ofPattern(DATE_FORMAT));
//    }
//
//    @Override
//    public String convertToEntityAttribute(LocalDate dbData) {
//        return dbData == null ? null : dbData.format(DateTimeFormatter.ofPattern(DATE_FORMAT));
//    }
//
//}
