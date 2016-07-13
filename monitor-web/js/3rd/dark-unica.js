/**
 * Dark theme for Highcharts JS
 * @author Torstein Honsi
 */

// Load the fonts
/*Highcharts.createElement('link', {
	href: 'https://fonts.googleapis.com/css?family=Unica+One',
	rel: 'stylesheet',
	type: 'text/css'
}, null, document.getElementsByTagName('head')[0]);*/

Highcharts.theme = {
	colors: ["rgba(86, 188, 118, 0.7"],
	chart: {
		backgroundColor: {
			linearGradient: { x1: 0, y1: 0, x2: 1, y2: 1 },
			stops: [
				[0, 'rgba(51,51,51,.4)']
			]
		},
		style: {
			fontFamily: "'Microsoft YaHei', sans-serif"
		},
		plotBorderColor: '#606063'
	},
	title: {
		style: {
			color: '#FFF',
			textTransform: 'uppercase',
			fontSize: '20px'
		},
		align: 'left',
	},
	subtitle: {
		style: {
			color: '#E0E0E3',
			textTransform: 'uppercase'
		}
	},
	xAxis: {
		gridLineColor: 'rgba(0, 0, 0, 0.0980392)',//网格线颜色
		labels: {
			style: {
				color: '#E0E0E3'
			}
		},
		lineColor: '#C0D0E0',//x轴颜色
		minorGridLineColor: '#505053',
		tickColor: '#C0D0E0',//刻度线颜色
		title: {
			style: {
				color: '#FFF'

			}
		}
	},
	yAxis: {
		gridLineColor: 'rgba(0, 0, 0, 0.0980392)',
		labels: {
			style: {
				color: '#E0E0E3'
			}
		},
		lineColor: 'C0D0E0',
		minorGridLineColor: '#505053',
		tickColor: 'C0D0E0',
		tickWidth: 1,
		title: {
			style: {
				color: '#FFF'
			}
		}
	},
	tooltip: {
		borderWidth: 0,
		borderColor: 'rgba(0, 0, 0, 0.4)',
		backgroundColor: 'rgba(0, 0, 0, 0.4)',
		style: {
			color: '#FFF'
		},
		crosshairs: {
			width: 1,
			color: 'rgba(0, 0, 0, 0.0980392)',
			dashStyle: 'solid'
		}
	},
	/*plotOptions: {
		series: {
			dataLabels: {
				color: '#B0B0B3'
			},
			marker: {//数据点标记
				enabled: false,
				lineColor: '#333'
			},
			fillColor: {
				linearGradient: [0, 0, 0, 300],
				stops: [
					[0, 'rgba(86, 188, 118, 0.901961)'],
					[1, 'rgb(234, 200, 94, 0.3)']
				]
			}
		},
		boxplot: {
			fillColor: '#505053'
		},
		candlestick: {
			lineColor: 'white'
		},
		errorbar: {
			color: 'white'
		}
	},*/
	legend: {
		itemStyle: {
			color: '#E0E0E3'
		},
		itemHoverStyle: {
			color: '#FFF'
		},
		itemHiddenStyle: {
			color: '#606063'
		}
	},
	credits: {
		enabled: false,
		style: {
			color: '#666'
		}
	},
	labels: {
		style: {
			color: 'rgba(0, 0, 0, 0.0980392)'
		}
	},

	drilldown: {
		activeAxisLabelStyle: {
			color: '#F0F0F3'
		},
		activeDataLabelStyle: {
			color: '#F0F0F3'
		}
	},

	navigation: {
		buttonOptions: {
			symbolStroke: '#DDDDDD',
			theme: {
				fill: '#505053'
			}
		}
	},

	// scroll charts
	rangeSelector: {
		buttonTheme: {
			fill: '#505053',
			stroke: '#000000',
			style: {
				color: '#CCC'
			},
			states: {
				hover: {
					fill: 'rgba(0, 0, 0, 0.0980392)',
					stroke: '#000000',
					style: {
						color: 'white'
					}
				},
				select: {
					fill: '#000003',
					stroke: '#000000',
					style: {
						color: 'white'
					}
				}
			}
		},
		inputBoxBorderColor: '#505053',
		inputStyle: {
			backgroundColor: '#333',
			color: 'silver'
		},
		labelStyle: {
			color: 'silver'
		}
	},

	navigator: {
		handles: {
			backgroundColor: '#666',
			borderColor: '#AAA'
		},
		outlineColor: '#CCC',
		maskFill: 'rgba(255,255,255,0.1)',
		series: {
			color: '#7798BF',
			lineColor: '#A6C7ED'
		},
		xAxis: {
			gridLineColor: '#505053'
		}
	},

	scrollbar: {
		barBackgroundColor: '#808083',
		barBorderColor: '#808083',
		buttonArrowColor: '#CCC',
		buttonBackgroundColor: '#606063',
		buttonBorderColor: '#606063',
		rifleColor: '#FFF',
		trackBackgroundColor: '#404043',
		trackBorderColor: '#404043'
	},

	// special colors for some of the
	legendBackgroundColor: 'rgba(0, 0, 0, 0.5)',
	background2: '#505053',
	dataLabelsColor: '#B0B0B3',
	textColor: '#C0C0C0',
	contrastTextColor: '#F0F0F3',
	maskColor: 'rgba(255,255,255,0.3)'
};

// Apply the theme
Highcharts.setOptions(Highcharts.theme);
