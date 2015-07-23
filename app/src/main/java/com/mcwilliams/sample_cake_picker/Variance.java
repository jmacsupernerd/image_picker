package com.mcwilliams.sample_cake_picker;

import java.util.List;

/**
 * Created by joshuamcwilliams on 7/23/15.
 */
public class Variance {
    private String varianceName;
    private List<Options> varianceOptions;

    public Variance(String varianceName, List<Options> varianceOptions) {
        this.varianceName = varianceName;
        this.varianceOptions = varianceOptions;
    }

    public String getVarianceName() {
        return varianceName;
    }

    public void setVarianceName(String varianceName) {
        this.varianceName = varianceName;
    }

    public List<Options> getVarianceOptions() {
        return varianceOptions;
    }

    public void setVarianceOptions(List<Options> varianceOptions) {
        this.varianceOptions = varianceOptions;
    }
}
