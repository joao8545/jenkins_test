dashboardView('NEWexample') {
    jobs {
        name("JobDSL")
        regex(/acme-.*/)
        name('NEWexample1')
    }
    columns {
        buildButton()
        status()
        weather()
        name()
        progressBar()
        
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
