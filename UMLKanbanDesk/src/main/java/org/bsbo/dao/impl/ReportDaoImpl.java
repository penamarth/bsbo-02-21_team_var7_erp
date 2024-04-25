package org.bsbo.dao.impl;

import org.bsbo.dao.ReportDao;
import org.bsbo.domain.Report;
import org.bsbo.dto.ReportDto;

public class ReportDaoImpl implements ReportDao {
    @Override
    public Report createMessageForReport(ReportDto reportDto) {
        System.out.println("Вызван метод createMessageForReport класса ReportDaoImpl");
        return new Report();
    }
}
