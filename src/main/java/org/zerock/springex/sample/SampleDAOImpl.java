package org.zerock.springex.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Qualifier("sample")
@Repository
public class SampleDAOImpl implements SampleDAO{
}
