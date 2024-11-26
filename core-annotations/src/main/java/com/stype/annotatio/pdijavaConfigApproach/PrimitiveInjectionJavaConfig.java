package com.stype.annotatio.pdijavaConfigApproach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("com/stype/pdijavaConfigApproach/app-values.properties")
public class PrimitiveInjectionJavaConfig {
    @Autowired
    private Environment env;

    @Bean()
    public Branch branch1(){
        Branch branch = new Branch();
        branch.setId(Integer.parseInt(env.getProperty("branch.id")));
        branch.setIfscCode(env.getProperty("branch.ifscCode"));
        branch.setBranchName(env.getProperty("branch.branchName"));
        branch.setLoc(env.getProperty("branch.loc"));
        return branch;
    }

    @Bean
    public Branch branch2(@Value("${branch.id}") int id,
                          @Value("${branch.ifscCode}") String ifscCode,
                          @Value("${branch.branchName}") String branchName,
                          @Value("${branch.loc}") String loc){
        Branch branch = new Branch();
        branch.setIfscCode(ifscCode);
        branch.setId(id);
        branch.setBranchName(branchName);
        branch.setLoc(loc);
        return branch;
    }
}
