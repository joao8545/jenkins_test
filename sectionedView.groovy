sectionedView('project-summary') {
    filterBuildQueue()
    filterExecutors()
    sections {
        listView {
            name('New projects from test')
            jobs {
                regex(/NEWexample.*/)
            }
            columns {
                buildButton()
                status()
                weather()
                name()
                lastSuccess()
                lastFailure()
                lastBuildConsole()
                progressBar()
                
            }
        }
        listView {
            name('Project B')
            jobs {
                regex(/project-B-.*/)
            }
            jobFilters {
                regex {
                    matchValue(RegexMatchValue.DESCRIPTION)
                    regex(/.*-project-B-.*/)
                }
            }
            columns {
                status()
                weather()
                name()
                lastSuccess()
                lastFailure()
            }
        }
    }
}