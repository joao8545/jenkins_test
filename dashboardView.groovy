dashboardView('example') {
    jobs {
        regex(/acme-.*/)
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
        iframe {
            effectiveUrl('http://example.com')
        }
        testStatisticsGrid()
        buildStatistics()
    }
}