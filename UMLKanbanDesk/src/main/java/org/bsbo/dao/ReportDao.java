package org.bsbo.dao;

import org.bsbo.domain.Report;
import org.bsbo.dto.ReportDto;

public interface ReportDao {
    Report createMessageForReport(ReportDto reportDto);
}
