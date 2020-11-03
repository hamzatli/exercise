package com.entitygraph.exercise.criteria;

import com.entitygraph.exercise.domain.Gender;
import com.entitygraph.exercise.domain.Language;
import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.LongFilter;
import io.github.jhipster.service.filter.StringFilter;
import lombok.Data;

/**
 * Created by Ismayil Hamzatli on Nov, 2020
 */
@Data
public class StudentCriteria {

    private LongFilter id;
    private IntegerFilter age;
    private StringFilter studentName;
    private LongFilter teacher;
    private GenderFilter gender;
    private LanguageFilter language;

    public static class GenderFilter extends Filter<Gender> {

    }
    public static class LanguageFilter extends Filter<Language> {

    }

}
