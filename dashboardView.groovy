dashboardView('NEWexample') {
    jobs {
        name("JobDSL")
        regex(/acme-.*/)
        regex('NEWexample.*')
    }
    columns {
        buildButton()
        status()
        weather()
        name()
        progressBar()
        lastBuildConsole()
        lastSuccess()
        lastFailure()
        
    }
    topPortlets {
        jenkinsJobsList {
            displayName('acme jobs')
        }
    }
    leftPortlets {
        testStatisticsChart()
    }
    rightPortlets {
        testTrendChart()
    }
    bottomPortlets {
        testStatisticsGrid()
        buildStatistics()
    }
}
